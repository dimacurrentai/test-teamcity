import math

import pytest

from test_teamcity.core import add

@pytest.mark.parametrize(
    "a,b,expected",
    [
        (0, 0, 0),
        (1, 2, 3),
        (-5, 7, 2),
        (1.5, 2.5, 4.0),
        (math.pi, math.e, math.pi + math.e),
    ],
)
def test_add_numbers(a, b, expected):
    assert add(a, b) == expected

def test_add_is_generic_plus():
    assert add("hello ", "world") == "hello world"
