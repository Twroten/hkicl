package com.hkicl.ecp.bkanvm.b039;

import com.hkicl.ecp.bkanvm.BankAcctNoValidator;

public class BankAcctNoValidator_039 implements BankAcctNoValidator {
    public int validate(String bankCode, String bankAcctNo) {
        if (isValidBranch() && isValidAccNum()) {
            return 0;
        } else if (isRequireBranchCheck() && isValidAccNum()) {
            return 1;
        } else
            return 2;
    }


    private boolean isValidBranch() {
        return false;
    }

    private boolean isValidAccNum() {
        return false;
    }

    private boolean isRequireBranchCheck() {
        return false;
    }

}