.class public final Ll/ܶ᩻ۡ;
.super Ll/۟ܶۡ;
.source "A924"


# instance fields
.field public final synthetic ۜ:Ll/ۗܺ᩷;

.field public ܳ:Ll/ܽܰ᩵;

.field public final synthetic ᩷:Ljava/lang/String;

.field public ᩻:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ljava/lang/String;)V
    .locals 0

    .line 250
    iput-object p1, p0, Ll/ܶ᩻ۡ;->ۜ:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ܶ᩻ۡ;->᩷:Ljava/lang/String;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ll/ܶ᩻ۡ;)V
    .locals 2

    .line 257
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    new-instance v1, Ll/۠᩻ۡ;

    invoke-direct {v1, p0}, Ll/۠᩻ۡ;-><init>(Ll/ܶ᩻ۡ;)V

    invoke-virtual {v0, v1}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 299
    iget-object v0, p0, Ll/ܶ᩻ۡ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    .line 58
    invoke-static {v0, v1}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Z)Ll/ۖ֨ܿ;

    move-result-object v0

    .line 300
    invoke-virtual {v0}, Ll/ۖ֨ܿ;->֫()Z

    move-result v1

    iget-object v2, p0, Ll/ܶ᩻ۡ;->ۜ:Ll/ۗܺ᩷;

    if-eqz v1, :cond_0

    .line 301
    invoke-virtual {v0}, Ll/ۖ֨ܿ;->ܽ()Ll/۫֨ܿ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 303
    iget-object v3, p0, Ll/ܶ᩻ۡ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ۖ֨ܿ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3, v0}, Ll/ۛ֨ܿ;->֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۛ֨ܿ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ۛ֨ܿ;->ۧ(Ll/ۛ֡ܿ;)V

    return-void

    .line 307
    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 308
    iget-object v3, p0, Ll/ܶ᩻ۡ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->۠ۧ()Landroid/net/Uri;

    move-result-object v3

    .line 309
    invoke-virtual {v0}, Ll/ۖ֨ܿ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v0, 0x10000000

    .line 310
    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 311
    invoke-static {v1, v3}, Ll/ۖ᩺ۘ;->֫(Landroid/content/Intent;Landroid/net/Uri;)V

    .line 312
    invoke-virtual {v2, v1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 317
    iget-object v0, p0, Ll/ܶ᩻ۡ;->ۜ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 256
    new-instance v0, Ll/֨᩻ۡ;

    invoke-direct {v0, p0}, Ll/֨᩻ۡ;-><init>(Ll/ܶ᩻ۡ;)V

    iget-object v1, p0, Ll/ܶ᩻ۡ;->ۜ:Ll/ۗܺ᩷;

    const v2, 0x7f1202d0

    const/16 v3, 0xc8

    invoke-virtual {p0, v1, v2, v3, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;IILjava/lang/Runnable;)V

    return-void
.end method

.method public final ܿ()V
    .locals 6

    .line 267
    new-instance v0, Ll/ۢ۟᩵;

    invoke-direct {v0}, Ll/ۢ۟᩵;-><init>()V

    invoke-static {}, Ll/᩶᩻ۡ;->ۧ()Ll/ۧܰ᩵;

    move-result-object v1

    .line 268
    invoke-virtual {v0, v1}, Ll/ۢ۟᩵;->֫(Ll/ۧܰ᩵;)V

    .line 269
    iget-object v1, p0, Ll/ܶ᩻ۡ;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    .line 270
    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v0

    .line 271
    invoke-static {}, Ll/᩶᩻ۡ;->ܽ()Ll/ܿ۟᩵;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v2

    iput-object v2, p0, Ll/ܶ᩻ۡ;->ܳ:Ll/ܽܰ᩵;

    .line 272
    invoke-interface {v2}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v2

    .line 273
    invoke-virtual {v2}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 275
    invoke-virtual {v3}, Ll/֡۟᩵;->֫()Ljava/io/InputStream;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    .line 280
    sget-object v1, Ll/ܽ֡ܿ;->ۢ:Ll/ܶ᩵ܿ;

    const-string v4, "Content-Disposition"

    .line 286
    invoke-virtual {v2, v4}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    const-string v5, "filename=\"?([^\"]+)\"?"

    .line 288
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 289
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 290
    invoke-virtual {v2, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 293
    :cond_1
    invoke-virtual {v0}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܰ᩵;->᩷()Ljava/util/List;

    move-result-object v0

    .line 0
    invoke-static {v4, v0}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 294
    check-cast v0, Ljava/lang/String;

    .line 280
    :goto_1
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ᩻ۡ;->᩻:Ll/ܶ᩵ܿ;

    .line 281
    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;)V

    return-void

    .line 278
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Response does not contain body: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ()V
    .locals 0

    .line 322
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
