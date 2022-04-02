package hello2.core.discount;

import hello2.core.member.Grade;
import hello2.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("Vip는 10%할인이 적용돼야 한다.")
    void vip_o() {
        //given
        Member member = new Member(1L, "vipMember", Grade.VIP);

        //when
        int discount = rateDiscountPolicy.discount(member, 10000);

        //then
        assertThat(discount).isEqualTo(1000);

    }

    @Test
    @DisplayName("Vip가 아니면 할인이 적용되면 안된다.")
    void vip_x() {
        //given
        Member member = new Member(1L, "basicMember", Grade.BASIC);

        //when
        int discount = rateDiscountPolicy.discount(member, 10000);

        //then
        assertThat(discount).isEqualTo(0);
    }
}