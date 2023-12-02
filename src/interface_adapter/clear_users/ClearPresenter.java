package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import use_case.signup.SignupOutputData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;
    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }


    @Override
    public void prepareView(ClearOutputData outputUsernames) {
        ClearState clearState = clearViewModel.getState();
        List<String> usernames = outputUsernames.getUsernames();
        clearState.setUsernames(usernames);
        clearViewModel.firePropertyChanged();
    }

}
