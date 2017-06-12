Working on creating a reproducible cloud dev setup (e.g. from coding from an ipad over ssh)

Current setup steps:


setting up a hack box

first, follow this tutorial to get users and auth.
then: create a new key and add it to github: https://help.github.com/articles/adding-a-new-ssh-key-to-your-github-account/ 

make sure to clone repos with ssh, not http. 

work from non-root user

NOW COMMANDS:

sudo apt-get update

- install mosh 
sudo apt-get install mosh

- then mosh in.

sudo apt-get install -y emacs 

# install spacemacs 

git clone https://github.com/syl20bnr/spacemacs ~/.emacs.d 

# get java 

sudo apt-get install -y openjdk-8-jre-headless

# get clojure 
sudo curl -o /usr/local/bin/lein https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein 
sudo chmod +x /usr/local/bin/lein 
lein

# get Haskell 
sudo apt-get install -y haskell-platform

# node and nvm

curl -o- https://raw.githubusercontent.com/creationix/nvm/v0.33.2/install.sh | bash
export NVM_DIR="$HOME/.nvm"
[ -s "$NVM_DIR/nvm.sh" ] && . "$NVM_DIR/nvm.sh"
[ -s "$NVM_DIR/bash_completion" ] && \. "$NVM_DIR/bash_completion"
nvm install node

# pandoc
sudo apt-get install -y pandoc

# python, just use anaconda to manage envs and such
curl -o anaconda.sh https://repo.continuum.io/archive/Anaconda3-4.4.0-Linux-x86_64.sh
bash ~/anaconda.sh 

# and answer yes when asked to prepend to path


# autojump because cd sucks
sudo apt-get install -y autojump

# R is nice to have too
sudo apt-get install -y r-base

# get boot on there too. 
sudo curl -fsSLo /usr/local/bin/boot https://github.com/boot-clj/boot-bin/releases/download/latest/boot.sh
sudo chmod +x /usr/local/bin/boot
boot

# lumo

npm install -g lumo-cljs

# tmux
sudo apt-get install tmux


THEN CONFIG -- spacemacs, zsh (oh-my-zsh?), leiningen, python environment with condo?  boot cli version (starts out totally obsolete.)

tmux config: https://www.digitalocean.com/community/tutorials/how-to-configure-tmux-on-a-cloud-server




mosh on iOS http://www.blink.sh/ 
