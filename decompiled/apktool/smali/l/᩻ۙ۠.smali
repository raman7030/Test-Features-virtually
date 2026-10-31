.class public final Ll/᩻ۙ۠;
.super Ljava/lang/Object;
.source "D9R4"


# static fields
.field public static ֫:Z


# direct methods
.method public static final ֫(III)I
    .locals 1

    if-lez p2, :cond_4

    if-lt p0, p1, :cond_0

    goto :goto_3

    .line 10
    :cond_0
    rem-int v0, p1, p2

    if-ltz v0, :cond_1

    goto :goto_0

    :cond_1
    add-int/2addr v0, p2

    :goto_0
    rem-int/2addr p0, p2

    if-ltz p0, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr p0, p2

    :goto_1
    sub-int/2addr v0, p0

    rem-int/2addr v0, p2

    if-ltz v0, :cond_3

    goto :goto_2

    :cond_3
    add-int/2addr v0, p2

    :goto_2
    sub-int/2addr p1, v0

    return p1

    :cond_4
    if-gez p2, :cond_9

    if-gt p0, p1, :cond_5

    :goto_3
    return p1

    :cond_5
    neg-int p2, p2

    rem-int/2addr p0, p2

    if-ltz p0, :cond_6

    goto :goto_4

    :cond_6
    add-int/2addr p0, p2

    :goto_4
    rem-int v0, p1, p2

    if-ltz v0, :cond_7

    goto :goto_5

    :cond_7
    add-int/2addr v0, p2

    :goto_5
    sub-int/2addr p0, v0

    rem-int/2addr p0, p2

    if-ltz p0, :cond_8

    goto :goto_6

    :cond_8
    add-int/2addr p0, p2

    :goto_6
    add-int/2addr p1, p0

    return p1

    .line 48
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Step is zero."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    .line 504
    :pswitch_0
    invoke-static {p0}, Ll/ܳᩴܺ;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "unknown-"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1
    const-string p0, "invoke-custom"

    return-object p0

    :pswitch_2
    const-string p0, "invoke-polymorphic"

    return-object p0

    :pswitch_3
    const-string p0, "fill-array-data"

    return-object p0

    :pswitch_4
    const-string p0, "move-result-pseudo"

    return-object p0

    :pswitch_5
    const-string p0, "move-result"

    return-object p0

    :pswitch_6
    const-string p0, "invoke-interface"

    return-object p0

    :pswitch_7
    const-string p0, "invoke-direct"

    return-object p0

    :pswitch_8
    const-string p0, "invoke-super"

    return-object p0

    :pswitch_9
    const-string p0, "invoke-virtual"

    return-object p0

    :pswitch_a
    const-string p0, "invoke-static"

    return-object p0

    :pswitch_b
    const-string p0, "put-static"

    return-object p0

    :pswitch_c
    const-string p0, "put-field"

    return-object p0

    :pswitch_d
    const-string p0, "get-static"

    return-object p0

    :pswitch_e
    const-string p0, "get-field"

    return-object p0

    :pswitch_f
    const-string p0, "instance-of"

    return-object p0

    :pswitch_10
    const-string p0, "check-cast"

    return-object p0

    :pswitch_11
    const-string p0, "filled-new-array"

    return-object p0

    :pswitch_12
    const-string p0, "new-array"

    return-object p0

    :pswitch_13
    const-string p0, "new-instance"

    return-object p0

    :pswitch_14
    const-string p0, "aput"

    return-object p0

    :pswitch_15
    const-string p0, "aget"

    return-object p0

    :pswitch_16
    const-string p0, "monitor-exit"

    return-object p0

    :pswitch_17
    const-string p0, "monitor-enter"

    return-object p0

    :pswitch_18
    const-string p0, "throw"

    return-object p0

    :pswitch_19
    const-string p0, "array-length"

    return-object p0

    :pswitch_1a
    const-string p0, "return"

    return-object p0

    :pswitch_1b
    const-string p0, "to-short"

    return-object p0

    :pswitch_1c
    const-string p0, "to-char"

    return-object p0

    :pswitch_1d
    const-string p0, "to-byte"

    return-object p0

    :pswitch_1e
    const-string p0, "conv"

    return-object p0

    :pswitch_1f
    const-string p0, "cmpg"

    return-object p0

    :pswitch_20
    const-string p0, "cmpl"

    return-object p0

    :pswitch_21
    const-string p0, "not"

    return-object p0

    :pswitch_22
    const-string p0, "ushr"

    return-object p0

    :pswitch_23
    const-string p0, "shr"

    return-object p0

    :pswitch_24
    const-string p0, "shl"

    return-object p0

    :pswitch_25
    const-string p0, "xor"

    return-object p0

    :pswitch_26
    const-string p0, "or"

    return-object p0

    :pswitch_27
    const-string p0, "and"

    return-object p0

    :pswitch_28
    const-string p0, "neg"

    return-object p0

    :pswitch_29
    const-string p0, "rem"

    return-object p0

    :pswitch_2a
    const-string p0, "div"

    return-object p0

    :pswitch_2b
    const-string p0, "mul"

    return-object p0

    :pswitch_2c
    const-string p0, "sub"

    return-object p0

    :pswitch_2d
    const-string p0, "add"

    return-object p0

    :pswitch_2e
    const-string p0, "switch"

    return-object p0

    :pswitch_2f
    const-string p0, "if-gt"

    return-object p0

    :pswitch_30
    const-string p0, "if-le"

    return-object p0

    :pswitch_31
    const-string p0, "if-ge"

    return-object p0

    :pswitch_32
    const-string p0, "if-lt"

    return-object p0

    :pswitch_33
    const-string p0, "if-ne"

    return-object p0

    :pswitch_34
    const-string p0, "if-eq"

    return-object p0

    :pswitch_35
    const-string p0, "goto"

    return-object p0

    :pswitch_36
    const-string p0, "const"

    return-object p0

    :pswitch_37
    const-string p0, "move-exception"

    return-object p0

    :pswitch_38
    const-string p0, "move-param"

    return-object p0

    :pswitch_39
    const-string p0, "move"

    return-object p0

    :pswitch_3a
    const-string p0, "nop"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 6

    const-string v0, "activity"

    .line 17
    invoke-static {v0}, Ll/ܳۙ۠;->֫(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 20
    :cond_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 21
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    :try_start_0
    const-string v5, "android.app.IActivityManager"

    .line 23
    invoke-virtual {v3, v5}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v5, 0x2

    .line 24
    invoke-virtual {v3, v5}, Landroid/os/Parcel;->writeInt(I)V

    const v5, 0x5f535549

    .line 25
    invoke-interface {v0, v5, v3, v4, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 26
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 27
    invoke-virtual {v4}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    .line 34
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 35
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    move-object v2, v0

    goto :goto_0

    .line 34
    :catchall_0
    :cond_1
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 35
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    :goto_0
    if-eqz v2, :cond_2

    .line 55
    invoke-static {v2, p0}, Ll/᩺᩶۠;->ܽ(Landroid/os/IBinder;Ljava/lang/String;)V

    const/4 p0, 0x1

    .line 56
    sput-boolean p0, Ll/᩻ۙ۠;->֫:Z

    return-void

    .line 59
    :cond_2
    sput-boolean v1, Ll/᩻ۙ۠;->֫:Z

    return-void
.end method

.method public static ֫()Z
    .locals 1

    .line 43
    sget-boolean v0, Ll/᩻ۙ۠;->֫:Z

    return v0
.end method
