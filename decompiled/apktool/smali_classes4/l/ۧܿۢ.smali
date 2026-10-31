.class public final Ll/ۧܿۢ;
.super Ll/ۙۜ֫;
.source "81J9"


# instance fields
.field public final synthetic ۜ:Ll/᩻ܿۢ;


# direct methods
.method public constructor <init>(Ll/᩻ܿۢ;Ll/ۚۜ֫;)V
    .locals 0

    .line 111
    iput-object p1, p0, Ll/ۧܿۢ;->ۜ:Ll/᩻ܿۢ;

    invoke-direct {p0, p2}, Ll/ۙۜ֫;-><init>(Ll/ۚۜ֫;)V

    return-void
.end method


# virtual methods
.method public final ֫(I)Ljava/lang/CharSequence;
    .locals 2

    .line 136
    iget-object v0, p0, Ll/ۧܿۢ;->ۜ:Ll/᩻ܿۢ;

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    const p1, 0x7f120a1e

    .line 144
    invoke-virtual {v0, p1}, Ll/ۡ᩻֫;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 146
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_1
    const p1, 0x7f120a1d

    .line 142
    invoke-virtual {v0, p1}, Ll/ۡ᩻֫;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const p1, 0x7f120a1c

    .line 140
    invoke-virtual {v0, p1}, Ll/ۡ᩻֫;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const p1, 0x7f120a1b

    .line 138
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

    .line 123
    new-instance p1, Ll/ܶۜۢ;

    invoke-direct {p1}, Ll/ܶۜۢ;-><init>()V

    return-object p1

    .line 125
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 121
    :cond_1
    new-instance p1, Ll/ܳ᩷ۢ;

    invoke-direct {p1}, Ll/ܳ᩷ۢ;-><init>()V

    return-object p1

    .line 119
    :cond_2
    new-instance p1, Ll/᩸᩻ۢ;

    invoke-direct {p1}, Ll/᩸᩻ۢ;-><init>()V

    return-object p1

    .line 117
    :cond_3
    new-instance p1, Ll/۟ܳۢ;

    invoke-direct {p1}, Ll/۟ܳۢ;-><init>()V

    return-object p1
.end method
