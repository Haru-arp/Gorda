package com.ssafy.gorda.dto.controllerdto.response;

import com.ssafy.gorda.domain.Donation;
import com.ssafy.gorda.domain.DonationComment;
import com.ssafy.gorda.domain.Foundation;
import com.ssafy.gorda.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ReadDonationResponseDto {

    private String donationIdx;
    private String foundationIdx;
    private String donationLogo;
    private String donationName;
    private String donationSubject;
    private String donationAccount;
    private String donationContent;
    private int donationLike;
    private double donationTargetEth;
    private double donationCurrentEth;
    private LocalDateTime donationStartDate;
    private LocalDateTime donationEndDate;

    public ReadDonationResponseDto(Donation donation) {

        this.donationIdx = donation.getDonationIdx();
        this.foundationIdx = donation.getFoundation().getFoundationIdx();
        this.donationLogo = donation.getDonationLogo();
        this.donationName = donation.getDonationName();
        this.donationSubject = donation.getDonationSubject();
        this.donationAccount = donation.getDonationAccount();
        this.donationContent = donation.getDonationContent();
        this.donationLike = donation.getDonationLike();
        this.donationTargetEth = donation.getDonationTargetEth();
        this.donationCurrentEth = donation.getDonationCurrentEth();
        this.donationStartDate = donation.getDonationStartDate();
        this.donationEndDate = donation.getDonationEndDate();

    }

}
