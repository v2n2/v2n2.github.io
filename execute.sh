#!/bin/bash

stty -echo

echo "***********************************************"
echo "*** STEP : MOVE File"
echo "***********************************************"
scp -r /var/jenkins_home/workspace/ta_test test@worker2:/home/test

echo "***********************************************"
echo "*** end"
