#!/bin/bash

stty -echo

echo "***********************************************"
echo "*** STEP : MOVE File"
echo "***********************************************"
scp -r root@worker2:/root /var/jenkins_home/workspace/ta_test

echo "***********************************************"
echo "*** end"
