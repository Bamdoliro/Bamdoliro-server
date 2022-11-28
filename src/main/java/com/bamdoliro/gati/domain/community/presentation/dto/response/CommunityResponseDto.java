package com.bamdoliro.gati.domain.community.presentation.dto.response;

import com.bamdoliro.gati.domain.community.domain.Community;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CommunityResponseDto {

    private Long id;
    private String name;
    private String backgroundImg;
    private int numberOfPeople;
    private int capacity;

    public static CommunityResponseDto of(Community community) {
        return CommunityResponseDto.builder()
                .id(community.getId())
                .name(community.getName())
                .backgroundImg(community.getBackgroundImg())
                .numberOfPeople(community.getMembers().size())
                .capacity(community.getCapacity())
                .build();
    }
}
