package com.vavilinigor.studygame.box2d;

import com.badlogic.gdx.math.Vector2;
import com.vavilinigor.studygame.enums.UserDataType;
import com.vavilinigor.studygame.utils.Constants;

/**
 * Created by ODSnew on 10.10.2017.
 */

public class RunnerUserData extends UserData {

    private Vector2 jumpingLinearImpulse;

    public RunnerUserData(){
        super();
        jumpingLinearImpulse = Constants.RUNNER_JUMPING_LINEAR_IMPULSE;
        userDataType = UserDataType.RUNNER;
    }

    public Vector2 getJumpingLinearImpulse(){
        return  jumpingLinearImpulse;
    }

    public void setJumpingLinearImpulse(Vector2 jumpingLinearImpulse){
        this.jumpingLinearImpulse = jumpingLinearImpulse;
    }
}
