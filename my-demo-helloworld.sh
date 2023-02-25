#!/bin/bash

millennium_text="Years since the millennium:"

current_time=$( date '+%H:%M:%S' )
todays_date=$( date '+%F' )
year=$( date '+%Y' )

echo "Current time:" $current_time
echo "Today's date:" $todays_date

years_since_Y2K=$(( year - 2000 ))

echo $millennium_text $years_since_Y2K
