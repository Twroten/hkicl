package com.hkicl.ecp.bkanvm.b039;

import com.hkicl.ecp.bkanvm.BankAcctNoValidator;

public class BankAcctNoValidator_039 implements BankAcctNoValidator {
    public int validate(String bankCode, String bankAcctNo) {

        boolean isValidBranch = isValidBranch();
        boolean isValidAccNum = isValidAccNum();
        boolean isRequireBranchCheck = isRequireBranchCheck();

        if (isValidBranch && isValidAccNum) {
            /**
             * Valid Bank Account Number and Bypass Branch Number Checking
             */
            return 0;
        } else if (isRequireBranchCheck && isValidAccNum) {
            /**
             * Valid Bank Account Number But Require Further Branch Number Checking
             */
            return 1;
        } else {
            /**
             * Invalid Bank Account Number
             */
            return 2;
        }
    }

    /**
     * 行号验证
     *
     * @return
     */
    private boolean isValidBranch() {
        return false;
    }

    /**
     * 帐号验证
     *
     * @return
     */
    private boolean isValidAccNum() {
        return false;
    }

    /**
     * 分行号验证
     *
     * @return
     */
    private boolean isRequireBranchCheck() {
        return false;
    }

}