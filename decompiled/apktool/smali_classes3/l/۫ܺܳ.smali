.class public final Ll/۫ܺܳ;
.super Ljava/lang/Object;
.source "VAIY"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 200
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 201
    iput-object p1, p0, Ll/۫ܺܳ;->ۧ:Ljava/lang/String;

    .line 202
    iput-object p2, p0, Ll/۫ܺܳ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/CharSequence;
    .locals 5

    .line 214
    iget-object v0, p0, Ll/۫ܺܳ;->֫:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    iget-object v0, p0, Ll/۫ܺܳ;->ۧ:Ljava/lang/String;

    return-object v0

    .line 217
    :cond_0
    new-instance v0, Landroid/text/SpannableString;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/۫ܺܳ;->֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/۫ܺܳ;->ۧ:Ljava/lang/String;

    const-string v3, ")"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 217
    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 218
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    sget v2, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v1, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    iget-object v2, p0, Ll/۫ܺܳ;->֫:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v3

    const/16 v4, 0x11

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    return-object v0
.end method
