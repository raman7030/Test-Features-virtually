.class public abstract Ll/ۘܺᩳ;
.super Landroid/os/Binder;
.source "71WO"

# interfaces
.implements Ll/ᩴܺᩳ;


# static fields
.field public static final synthetic ܿ:I


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    const-string v0, "bin.mt.dstr.ipc.IDecryptorAidlInterface"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_0

    const v2, 0xffffff

    if-gt p1, v2, :cond_0

    .line 113
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_0
    const v2, 0x5f4e5446

    if-ne p1, v2, :cond_1

    .line 116
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :cond_1
    packed-switch p1, :pswitch_data_0

    .line 277
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 270
    :pswitch_0
    move-object p1, p0

    check-cast p1, Ll/ۜܺᩳ;

    .line 601
    iget-object p1, p1, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    invoke-static {p1}, Ll/ܺܺᩳ;->ܳ(Ll/ܺܺᩳ;)I

    move-result p1

    .line 271
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 272
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 261
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 263
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    .line 910
    invoke-static {p1, p2}, Ll/ܶܺᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 250
    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 252
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    .line 253
    move-object p4, p0

    check-cast p4, Ll/ۜܺᩳ;

    invoke-virtual {p4, p1, p2}, Ll/ۜܺᩳ;->ܽ(Ljava/lang/String;Ljava/lang/String;)[I

    move-result-object p1

    .line 254
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 255
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeIntArray([I)V

    return v1

    .line 239
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 241
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    .line 242
    move-object p4, p0

    check-cast p4, Ll/ۜܺᩳ;

    invoke-virtual {p4, p1, p2}, Ll/ۜܺᩳ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)[I

    move-result-object p1

    .line 243
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 244
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeIntArray([I)V

    return v1

    .line 228
    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 230
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    .line 231
    move-object p4, p0

    check-cast p4, Ll/ۜܺᩳ;

    invoke-virtual {p4, p1, p2}, Ll/ۜܺᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)[I

    move-result-object p1

    .line 232
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 233
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeIntArray([I)V

    return v1

    .line 217
    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 219
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    .line 220
    move-object p4, p0

    check-cast p4, Ll/ۜܺᩳ;

    invoke-virtual {p4, p1, p2}, Ll/ۜܺᩳ;->ܳ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 221
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 222
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    .line 206
    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 208
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    .line 209
    move-object p4, p0

    check-cast p4, Ll/ۜܺᩳ;

    invoke-virtual {p4, p1, p2}, Ll/ۜܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    .line 210
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 211
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 197
    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    .line 198
    move-object p2, p0

    check-cast p2, Ll/ۜܺᩳ;

    invoke-virtual {p2, p1}, Ll/ۜܺᩳ;->֫([B)[I

    move-result-object p1

    .line 199
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 200
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeIntArray([I)V

    return v1

    .line 188
    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    .line 189
    move-object p2, p0

    check-cast p2, Ll/ۜܺᩳ;

    invoke-virtual {p2, p1}, Ll/ۜܺᩳ;->ܽ([B)[I

    move-result-object p1

    .line 190
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 191
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeIntArray([I)V

    return v1

    .line 179
    :pswitch_9
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    .line 180
    move-object p2, p0

    check-cast p2, Ll/ۜܺᩳ;

    invoke-virtual {p2, p1}, Ll/ۜܺᩳ;->ܿ([B)[I

    move-result-object p1

    .line 181
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 182
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeIntArray([I)V

    return v1

    .line 170
    :pswitch_a
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    .line 171
    move-object p2, p0

    check-cast p2, Ll/ۜܺᩳ;

    invoke-virtual {p2, p1}, Ll/ۜܺᩳ;->ۧ([B)[B

    move-result-object p1

    .line 172
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 173
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeByteArray([B)V

    return v1

    .line 161
    :pswitch_b
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    .line 162
    move-object p2, p0

    check-cast p2, Ll/ۜܺᩳ;

    invoke-virtual {p2, p1}, Ll/ۜܺᩳ;->ܳ([B)Ljava/lang/String;

    move-result-object p1

    .line 163
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 164
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    .line 152
    :pswitch_c
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    .line 153
    move-object p2, p0

    check-cast p2, Ll/ۜܺᩳ;

    invoke-virtual {p2, p1}, Ll/ۜܺᩳ;->ᩳ([B)Ljava/lang/String;

    move-result-object p1

    .line 154
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 155
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    .line 144
    :pswitch_d
    move-object p1, p0

    check-cast p1, Ll/ۜܺᩳ;

    invoke-virtual {p1}, Ll/ۜܺᩳ;->ۚ()[Ljava/lang/String;

    move-result-object p1

    .line 145
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 146
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    return v1

    .line 138
    :pswitch_e
    move-object p1, p0

    check-cast p1, Ll/ۜܺᩳ;

    invoke-virtual {p1}, Ll/ۜܺᩳ;->exit()V

    .line 139
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 124
    :pswitch_f
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 126
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    const/4 v0, 0x0

    if-eqz p4, :cond_2

    const/4 p4, 0x1

    goto :goto_0

    :cond_2
    const/4 p4, 0x0

    .line 128
    :goto_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    .line 130
    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    if-eqz p2, :cond_4

    const/4 v0, 0x1

    .line 131
    :cond_4
    move-object p2, p0

    check-cast p2, Ll/ۜܺᩳ;

    invoke-virtual {p2, p1, p4, v2, v0}, Ll/ۜܺᩳ;->֫(Ljava/lang/String;ZZZ)Z

    move-result p1

    .line 132
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 133
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
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
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
