.class public final Ll/᩸᩺᩷;
.super Ll/ۙۜ֫;
.source "F1FR"


# instance fields
.field public final synthetic ۜ:Ll/ۙ᩺᩷;


# direct methods
.method public constructor <init>(Ll/ۙ᩺᩷;Ll/ۚۜ֫;)V
    .locals 0

    .line 93
    iput-object p1, p0, Ll/᩸᩺᩷;->ۜ:Ll/ۙ᩺᩷;

    invoke-direct {p0, p2}, Ll/ۙۜ֫;-><init>(Ll/ۚۜ֫;)V

    return-void
.end method


# virtual methods
.method public final ֫(I)Ljava/lang/CharSequence;
    .locals 2

    .line 118
    iget-object v0, p0, Ll/᩸᩺᩷;->ۜ:Ll/ۙ᩺᩷;

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    const p1, 0x7f120a1e

    .line 126
    invoke-virtual {v0, p1}, Ll/ۡ᩻֫;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 128
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_1
    const p1, 0x7f120a1d

    .line 124
    invoke-virtual {v0, p1}, Ll/ۡ᩻֫;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const p1, 0x7f120a1c

    .line 122
    invoke-virtual {v0, p1}, Ll/ۡ᩻֫;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const p1, 0x7f120a1b

    .line 120
    invoke-virtual {v0, p1}, Ll/ۡ᩻֫;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final ۧ(I)Ll/ۡ᩻֫;
    .locals 1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 105
    new-instance p1, Ll/᩵۟᩷;

    invoke-direct {p1}, Ll/᩵۟᩷;-><init>()V

    return-object p1

    .line 107
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 103
    :cond_1
    new-instance p1, Ll/ۛ۟᩷;

    invoke-direct {p1}, Ll/ۛ۟᩷;-><init>()V

    return-object p1

    .line 101
    :cond_2
    new-instance p1, Ll/ܰܰ᩷;

    invoke-direct {p1}, Ll/ܰܰ᩷;-><init>()V

    return-object p1

    .line 99
    :cond_3
    new-instance p1, Ll/᩸ܰ᩷;

    invoke-direct {p1}, Ll/᩸ܰ᩷;-><init>()V

    return-object p1
.end method
