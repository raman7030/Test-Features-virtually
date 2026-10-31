.class public Ll/ܶۖ֫;
.super Ljava/lang/Object;
.source "722Z"

# interfaces
.implements Ll/᩵ۖ֫;


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 61
    iput v0, p0, Ll/ܶۖ֫;->ᩳ:I

    .line 66
    iput v0, p0, Ll/ܶۖ֫;->֫:I

    .line 71
    iput v0, p0, Ll/ܶۖ֫;->ۧ:I

    const/4 v0, -0x1

    .line 76
    iput v0, p0, Ll/ܶۖ֫;->ܽ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 10

    .line 150
    instance-of v0, p1, Ll/ܶۖ֫;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 153
    :cond_0
    check-cast p1, Ll/ܶۖ֫;

    .line 154
    iget v0, p0, Ll/ܶۖ֫;->֫:I

    .line 120
    iget v2, p1, Ll/ܶۖ֫;->֫:I

    if-ne v0, v2, :cond_6

    .line 154
    iget v0, p0, Ll/ܶۖ֫;->ۧ:I

    .line 130
    iget v2, p1, Ll/ܶۖ֫;->ۧ:I

    .line 107
    iget v3, p1, Ll/ܶۖ֫;->ܽ:I

    const/4 v4, -0x1

    const/4 v5, 0x1

    const/4 v6, 0x6

    const/4 v7, 0x7

    if-eq v3, v4, :cond_1

    move v4, v3

    goto :goto_0

    .line 110
    :cond_1
    iget v4, p1, Ll/ܶۖ֫;->ᩳ:I

    sget v8, Ll/ۘۖ֫;->ۧ:I

    and-int/lit8 v8, v2, 0x1

    if-ne v8, v5, :cond_2

    const/4 v4, 0x7

    goto :goto_0

    :cond_2
    and-int/lit8 v8, v2, 0x4

    const/4 v9, 0x4

    if-ne v8, v9, :cond_3

    const/4 v4, 0x6

    goto :goto_0

    :cond_3
    packed-switch v4, :pswitch_data_0

    :pswitch_0
    const/4 v4, 0x3

    goto :goto_0

    :pswitch_1
    const/4 v4, 0x1

    goto :goto_0

    :pswitch_2
    const/16 v4, 0xa

    goto :goto_0

    :pswitch_3
    const/4 v4, 0x2

    goto :goto_0

    :pswitch_4
    const/4 v4, 0x5

    goto :goto_0

    :pswitch_5
    const/4 v4, 0x4

    goto :goto_0

    :pswitch_6
    const/16 v4, 0x8

    goto :goto_0

    :pswitch_7
    const/4 v4, 0x0

    :goto_0
    if-ne v4, v6, :cond_4

    or-int/lit8 v2, v2, 0x4

    goto :goto_1

    :cond_4
    if-ne v4, v7, :cond_5

    or-int/lit8 v2, v2, 0x1

    :cond_5
    :goto_1
    and-int/lit16 v2, v2, 0x111

    if-ne v0, v2, :cond_6

    .line 155
    iget v0, p0, Ll/ܶۖ֫;->ᩳ:I

    .line 125
    iget p1, p1, Ll/ܶۖ֫;->ᩳ:I

    if-ne v0, p1, :cond_6

    .line 156
    iget p1, p0, Ll/ܶۖ֫;->ܽ:I

    if-ne p1, v3, :cond_6

    return v5

    :cond_6
    return v1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 6

    .line 145
    iget v0, p0, Ll/ܶۖ֫;->֫:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ܶۖ֫;->ۧ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ll/ܶۖ֫;->ᩳ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Ll/ܶۖ֫;->ܽ:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AudioAttributesCompat:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    iget v1, p0, Ll/ܶۖ֫;->ܽ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const-string v1, " stream="

    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܶۖ֫;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " derived"

    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, " usage="

    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܶۖ֫;->ᩳ:I

    .line 169
    sget v2, Ll/ۘۖ֫;->ۧ:I

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    const-string v2, "unknown usage "

    .line 0
    invoke-static {v1, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :pswitch_1
    const-string v1, "USAGE_ASSISTANT"

    goto :goto_0

    :pswitch_2
    const-string v1, "USAGE_GAME"

    goto :goto_0

    :pswitch_3
    const-string v1, "USAGE_ASSISTANCE_SONIFICATION"

    goto :goto_0

    :pswitch_4
    const-string v1, "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE"

    goto :goto_0

    :pswitch_5
    const-string v1, "USAGE_ASSISTANCE_ACCESSIBILITY"

    goto :goto_0

    :pswitch_6
    const-string v1, "USAGE_NOTIFICATION_EVENT"

    goto :goto_0

    :pswitch_7
    const-string v1, "USAGE_NOTIFICATION_COMMUNICATION_DELAYED"

    goto :goto_0

    :pswitch_8
    const-string v1, "USAGE_NOTIFICATION_COMMUNICATION_INSTANT"

    goto :goto_0

    :pswitch_9
    const-string v1, "USAGE_NOTIFICATION_COMMUNICATION_REQUEST"

    goto :goto_0

    :pswitch_a
    const-string v1, "USAGE_NOTIFICATION_RINGTONE"

    goto :goto_0

    :pswitch_b
    const-string v1, "USAGE_NOTIFICATION"

    goto :goto_0

    :pswitch_c
    const-string v1, "USAGE_ALARM"

    goto :goto_0

    :pswitch_d
    const-string v1, "USAGE_VOICE_COMMUNICATION_SIGNALLING"

    goto :goto_0

    :pswitch_e
    const-string v1, "USAGE_VOICE_COMMUNICATION"

    goto :goto_0

    :pswitch_f
    const-string v1, "USAGE_MEDIA"

    goto :goto_0

    :pswitch_10
    const-string v1, "USAGE_UNKNOWN"

    .line 169
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " content="

    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܶۖ֫;->֫:I

    .line 171
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " flags=0x"

    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܶۖ֫;->ۧ:I

    .line 173
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
