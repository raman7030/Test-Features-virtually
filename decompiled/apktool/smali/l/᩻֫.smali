.class public abstract Ll/᩻֫;
.super Landroid/os/Binder;
.source "64W0"

# interfaces
.implements Ll/᩷֫;


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    const-string v0, "android.support.v4.media.session.IMediaControllerCallback"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_0

    const v2, 0xffffff

    if-gt p1, v2, :cond_0

    .line 92
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_0
    const v2, 0x5f4e5446

    if-ne p1, v2, :cond_1

    .line 95
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :cond_1
    packed-switch p1, :pswitch_data_0

    .line 191
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 186
    :pswitch_0
    move-object p1, p0

    check-cast p1, Ll/ᩴ֫;

    invoke-virtual {p1}, Ll/ᩴ֫;->ۛ()V

    return v1

    .line 180
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 181
    move-object p1, p0

    check-cast p1, Ll/ᩴ֫;

    invoke-virtual {p1}, Ll/ᩴ֫;->ۨ()V

    return v1

    .line 173
    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 174
    move-object p1, p0

    check-cast p1, Ll/ᩴ֫;

    invoke-virtual {p1}, Ll/ᩴ֫;->۬()V

    return v1

    .line 166
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    return v1

    .line 159
    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 160
    move-object p1, p0

    check-cast p1, Ll/ᩴ֫;

    invoke-virtual {p1}, Ll/ᩴ֫;->ۤ()V

    return v1

    .line 152
    :pswitch_5
    sget-object p1, Ll/᩷ۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Ll/ۜ֫;->֫(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۧ;

    .line 153
    invoke-interface {p0, p1}, Ll/᩷֫;->֫(Ll/᩷ۧ;)V

    return v1

    .line 145
    :pswitch_6
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Ll/ۜ֫;->֫(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    .line 146
    invoke-interface {p0}, Ll/᩷֫;->ۖ()V

    return v1

    .line 138
    :pswitch_7
    sget-object p1, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Ll/ۜ֫;->֫(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    .line 139
    invoke-interface {p0}, Ll/᩷֫;->ܽ()V

    return v1

    .line 131
    :pswitch_8
    sget-object p1, Ll/ۧۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, p1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 132
    invoke-interface {p0}, Ll/᩷֫;->ۙ()V

    return v1

    .line 124
    :pswitch_9
    sget-object p1, Ll/ۧ֫;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Ll/ۜ֫;->֫(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧ֫;

    .line 125
    invoke-interface {p0, p1}, Ll/᩷֫;->֫(Ll/ۧ֫;)V

    return v1

    .line 117
    :pswitch_a
    sget-object p1, Ll/᩵ۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Ll/ۜ֫;->֫(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۧ;

    .line 118
    move-object p2, p0

    check-cast p2, Ll/ᩴ֫;

    invoke-virtual {p2, p1}, Ll/ᩴ֫;->֫(Ll/᩵ۧ;)V

    return v1

    .line 111
    :pswitch_b
    invoke-interface {p0}, Ll/᩷֫;->ۘ()V

    return v1

    .line 103
    :pswitch_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 105
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Ll/ۜ֫;->֫(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    .line 106
    move-object p1, p0

    check-cast p1, Ll/ᩴ֫;

    invoke-virtual {p1}, Ll/ᩴ֫;->۫()V

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
