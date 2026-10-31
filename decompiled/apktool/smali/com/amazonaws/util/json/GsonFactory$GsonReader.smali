.class public final Lcom/amazonaws/util/json/GsonFactory$GsonReader;
.super Ljava/lang/Object;
.source "GsonFactory.java"


# instance fields
.field public final ֫:Ll/ܿۜۖ;


# direct methods
.method public constructor <init>(Ljava/io/StringReader;)V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    new-instance v0, Ll/ܿۜۖ;

    invoke-direct {v0, p1}, Ll/ܿۜۖ;-><init>(Ljava/io/StringReader;)V

    iput-object v0, p0, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->֫:Ll/ܿۜۖ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->֫:Ll/ܿۜۖ;

    invoke-virtual {v0}, Ll/ܿۜۖ;->ܽ()V

    return-void
.end method

.method public final ۜ()Lcom/amazonaws/util/json/AwsJsonToken;
    .locals 3

    const/4 v0, 0x0

    .line 111
    :try_start_0
    iget-object v1, p0, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->֫:Ll/ܿۜۖ;

    invoke-virtual {v1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 127
    :cond_0
    sget-object v2, Lcom/amazonaws/util/json/GsonFactory$1;->֫:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    .line 149
    sget-object v0, Lcom/amazonaws/util/json/AwsJsonToken;->۫:Lcom/amazonaws/util/json/AwsJsonToken;

    goto :goto_0

    .line 145
    :pswitch_0
    sget-object v0, Lcom/amazonaws/util/json/AwsJsonToken;->᩺:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object v0

    .line 143
    :pswitch_1
    sget-object v0, Lcom/amazonaws/util/json/AwsJsonToken;->ۛ:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object v0

    .line 141
    :pswitch_2
    sget-object v0, Lcom/amazonaws/util/json/AwsJsonToken;->ۨ:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object v0

    .line 139
    :pswitch_3
    sget-object v0, Lcom/amazonaws/util/json/AwsJsonToken;->ۤ:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object v0

    .line 137
    :pswitch_4
    sget-object v0, Lcom/amazonaws/util/json/AwsJsonToken;->۬:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object v0

    .line 135
    :pswitch_5
    sget-object v0, Lcom/amazonaws/util/json/AwsJsonToken;->ۗ:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object v0

    .line 133
    :pswitch_6
    sget-object v0, Lcom/amazonaws/util/json/AwsJsonToken;->᩶:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object v0

    .line 131
    :pswitch_7
    sget-object v0, Lcom/amazonaws/util/json/AwsJsonToken;->ۙ:Lcom/amazonaws/util/json/AwsJsonToken;

    return-object v0

    .line 129
    :pswitch_8
    sget-object v0, Lcom/amazonaws/util/json/AwsJsonToken;->᩹:Lcom/amazonaws/util/json/AwsJsonToken;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    nop

    :catch_0
    :goto_0
    :pswitch_9
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_9
    .end packed-switch
.end method

.method public final ۧ()V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->֫:Ll/ܿۜۖ;

    invoke-virtual {v0}, Ll/ܿۜۖ;->close()V

    return-void
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->֫:Ll/ܿۜۖ;

    invoke-virtual {v0}, Ll/ܿۜۖ;->ۙ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->֫:Ll/ܿۜۖ;

    invoke-virtual {v0}, Ll/ܿۜۖ;->᩻()V

    return-void
.end method

.method public final ܿ()Z
    .locals 2

    .line 75
    iget-object v0, p0, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->֫:Ll/ܿۜۖ;

    invoke-virtual {v0}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    .line 76
    sget-object v1, Ll/ܳۜۖ;->᩹:Ll/ܳۜۖ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Ll/ܳۜۖ;->᩶:Ll/ܳۜۖ;

    .line 77
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->֫:Ll/ܿۜۖ;

    invoke-virtual {v0}, Ll/ܿۜۖ;->ᩴ()Z

    move-result v0

    return v0
.end method

.method public final ᩷()V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->֫:Ll/ܿۜۖ;

    invoke-virtual {v0}, Ll/ܿۜۖ;->᩺()V

    return-void
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 3

    .line 92
    iget-object v0, p0, Lcom/amazonaws/util/json/GsonFactory$GsonReader;->֫:Ll/ܿۜۖ;

    invoke-virtual {v0}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v1

    .line 93
    sget-object v2, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 94
    invoke-virtual {v0}, Ll/ܿۜۖ;->ۗ()V

    const/4 v0, 0x0

    return-object v0

    .line 97
    :cond_0
    sget-object v2, Ll/ܳۜۖ;->ۙ:Ll/ܳۜۖ;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 98
    invoke-virtual {v0}, Ll/ܿۜۖ;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "true"

    return-object v0

    :cond_1
    const-string v0, "false"

    return-object v0

    .line 100
    :cond_2
    invoke-virtual {v0}, Ll/ܿۜۖ;->۬()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
