package im.tox.antox.callbacks;

import android.content.Context;

import im.tox.antox.AntoxFriend;
import im.tox.jtoxcore.callbacks.OnNameChangeCallback;

/**
 * Created by soft on 03/03/14.
 */
public class AntoxOnNameChangeCallback implements OnNameChangeCallback<AntoxFriend> {

    private Context ctx;

    public AntoxOnNameChangeCallback(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public void execute(AntoxFriend friend, String newName) {

    }
}
