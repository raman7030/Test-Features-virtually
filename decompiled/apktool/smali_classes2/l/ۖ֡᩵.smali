.class public final Ll/ۖ֡᩵;
.super Ll/᩵ۡ᩵;
.source "Z9WT"


# static fields
.field public static final serialVersionUID:J = 0x6d63427a380dfa0L


# instance fields
.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x2

    .line 105
    invoke-static {v0, p1}, Ll/ۖ֡᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    .line 58
    invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 106
    iput v0, p0, Ll/ۖ֡᩵;->᩸:I

    .line 107
    iput p1, p0, Ll/ۖ֡᩵;->᩹:I

    return-void
.end method

.method public static ֫(II)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const-string p1, "unknown error class: "

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, -0x1

    if-eq p1, p0, :cond_2

    const/16 p0, 0x8f

    if-eq p1, p0, :cond_1

    packed-switch p1, :pswitch_data_0

    const-string p0, "ERR_SSN_SRVC/Unknown error code: "

    invoke-static {p1, p0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "ERR_SSN_SRVC/Called name present, but insufficient resources"

    return-object p0

    :pswitch_1
    const-string p0, "ERR_SSN_SRVC/Called name not present"

    return-object p0

    :pswitch_2
    const-string p0, "ERR_SSN_SRVC/Not listening for calling name"

    return-object p0

    :pswitch_3
    const-string p0, "ERR_SSN_SRVC/Not listening on called name"

    return-object p0

    :cond_1
    const-string p0, "ERR_SSN_SRVC/Unspecified error"

    return-object p0

    :cond_2
    const-string p0, "ERR_SSN_SRVC/Connection refused"

    return-object p0

    :cond_3
    if-eq p1, v0, :cond_4

    const-string p0, "ERR_NAM_SRVC/"

    goto :goto_0

    :cond_4
    const-string p0, "ERR_NAM_SRVC/FMT_ERR: Format Error"

    .line 69
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "Unknown error code: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    const-string p0, "SUCCESS"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x80
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 113
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "errorClass="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/ۖ֡᩵;->᩸:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",errorCode="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/ۖ֡᩵;->᩹:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ",errorString="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    invoke-static {v2, v3}, Ll/ۖ֡᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
