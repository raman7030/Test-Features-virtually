.class public final Ll/ۚ᩷᩵;
.super Ll/᩵᩷᩵;
.source "C9Z9"


# virtual methods
.method public final ֫(Z)Ll/᩶ۢ᩵;
    .locals 1

    .line 238
    invoke-super {p0, p1}, Ll/᩵᩷᩵;->֫(Z)Ll/᩶ۢ᩵;

    move-result-object p1

    .line 239
    iget-object v0, p0, Ll/᩵᩷᩵;->ۘ:Ljava/net/InetAddress;

    check-cast v0, Ljava/net/Inet4Address;

    invoke-virtual {p1, v0}, Ll/᩶ۢ᩵;->֫(Ljava/net/Inet4Address;)V

    return-object p1
.end method

.method public final ֫(Ll/ܿ᩷᩵;)V
    .locals 5

    .line 215
    iget-object v0, p0, Ll/᩵᩷᩵;->ۘ:Ljava/net/InetAddress;

    if-eqz v0, :cond_1

    .line 216
    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v1

    .line 218
    instance-of v0, v0, Ljava/net/Inet4Address;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    new-array v2, v0, [B

    const/16 v3, 0xc

    const/4 v4, 0x0

    .line 224
    invoke-static {v1, v3, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v2

    .line 226
    :goto_0
    array-length v0, v1

    .line 227
    invoke-virtual {p1, v0, v1}, Ll/ܿ᩷᩵;->֫(I[B)V

    :cond_1
    return-void
.end method
