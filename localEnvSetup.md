# Local Environment Setup

## [Visual Studio Code](https://code.visualstudio.com/)

### Setup `code` command to trigger VS code
1. Verifiy Visual Studio Code is installed in /Applications
2. Verify `/usr/local/bin` is in `PATH`
```
echo $PATH
```

If necessary, manually add `/usr/local/bin` to your `PATH` by editing your shell configuration file (e.g., `~/.zshrc` for zsh) with:
```
export PATH="/usr/local/bin:$PATH"
```

If necessary, manually create a symbolic link:
```
sudo ln -s "/Applications/Visual Studio Code.app/Contents/Resources/app/bin/code" /usr/local/bin/code
```

## [HomeBrew](https://brew.sh/)

```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

brew install --cask iterm2
```

## [Install and set up zsh as default](https://github.com/ohmyzsh/ohmyzsh/wiki/Installing-ZSH#install-and-set-up-zsh-as-default)

## [Install and setup on-my-zsh](https://github.com/ohmyzsh/ohmyzsh/blob/master/README.md#manual-installation)

## Recommended Plugins

```
git clone https://github.com/zsh-users/zsh-autosuggestions.git ${ZSH_CUSTOM:-~/.oh-my-zsh/custom}/plugins/zsh-autosuggestions

git clone https://github.com/zsh-users/zsh-syntax-highlighting.git ${ZSH_CUSTOM:-~/.oh-my-zsh/custom}/plugins/zsh-syntax-highlighting

git clone https://github.com/MichaelAquilina/zsh-you-should-use ${ZSH_CUSTOM:-~/.oh-my-zsh/custom}/plugins/zsh-you-should-use
```

## Others

### [Install Python on mac](https://www.geeksforgeeks.org/how-to-install-python-on-mac/)
```
brew install python

pip install notebook
```