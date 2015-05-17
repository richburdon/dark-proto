#!/usr/bin/env python

#
# Used by distutils.
# https://docs.python.org/2/distutils/introduction.html
# https://docs.python.org/2/distutils/setupscript.html
#

from distutils.core import setup

setup(
    name='DarkProto',
    version='1.0',
    description='Dark Proto',
    author='Alien Labs',
    author_email='rich.burdon@gmail.com',
    url='https://github.com/richburdon/dark-proto',
    setup_requires=['nose>=1.0'],
    packages=[]
)
