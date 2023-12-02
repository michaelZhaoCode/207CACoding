package use_case.clear_users;

// TODO Complete me

import entity.User;

import java.util.List;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface userDataAccessObject;

    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        List<String> usernames = userDataAccessObject.clear();

        ClearOutputData outputUsernames = new ClearOutputData(usernames);
        clearPresenter.prepareView(outputUsernames);
    }

}
