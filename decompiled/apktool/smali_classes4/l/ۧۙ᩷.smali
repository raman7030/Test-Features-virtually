.class public final Ll/ۧۙ᩷;
.super Ll/ܰۙۧ;
.source "T12U"


# virtual methods
.method public final ֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;Ll/ۗ۬ۧ;)Z
    .locals 5

    .line 116
    invoke-virtual {p2}, Ll/ۗ۬ۧ;->getAdapterPosition()I

    move-result p2

    .line 117
    invoke-virtual {p3}, Ll/ۗ۬ۧ;->getAdapterPosition()I

    move-result p3

    .line 118
    invoke-static {}, Ll/ܿۙ᩷;->ۢ֫()[I

    move-result-object v0

    aget v0, v0, p2

    if-le p2, p3, :cond_0

    .line 120
    invoke-static {}, Ll/ܿۙ᩷;->ۢ֫()[I

    move-result-object v1

    invoke-static {}, Ll/ܿۙ᩷;->ۢ֫()[I

    move-result-object v2

    add-int/lit8 v3, p3, 0x1

    sub-int v4, p2, p3

    invoke-static {v1, p3, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 122
    :cond_0
    invoke-static {}, Ll/ܿۙ᩷;->ۢ֫()[I

    move-result-object v1

    add-int/lit8 v2, p2, 0x1

    invoke-static {}, Ll/ܿۙ᩷;->ۢ֫()[I

    move-result-object v3

    sub-int v4, p3, p2

    invoke-static {v1, v2, v3, p2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 124
    :goto_0
    invoke-static {}, Ll/ܿۙ᩷;->ۢ֫()[I

    move-result-object v1

    aput v0, v1, p3

    .line 126
    invoke-virtual {p1}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ܽ(Ll/ۗ۬ۧ;)V
    .locals 0

    return-void
.end method
