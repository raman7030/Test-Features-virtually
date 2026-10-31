.class public final Ll/ᩳ᩹᩻;
.super Ll/۟ܶۡ;
.source "8985"


# instance fields
.field public ۜ:Ll/ܶ֡ܿ;

.field public final synthetic ۡ:J

.field public final synthetic ۢ:Z

.field public ܳ:Ll/᩺ۤܿ;

.field public final synthetic ᩷:Ll/ۗܺ᩷;

.field public ᩻:Ll/᩵ۛۡ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;JZ)V
    .locals 0

    .line 258
    iput-object p1, p0, Ll/ᩳ᩹᩻;->᩷:Ll/ۗܺ᩷;

    iput-wide p2, p0, Ll/ᩳ᩹᩻;->ۡ:J

    iput-boolean p4, p0, Ll/ᩳ᩹᩻;->ۢ:Z

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳ᩹᩻;)Ll/᩺ۤܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ᩹᩻;->ܳ:Ll/᩺ۤܿ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ᩳ᩹᩻;Ll/᩵ۛۡ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ᩳ᩹᩻;->᩻:Ll/᩵ۛۡ;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ᩳ᩹᩻;)Ll/᩵ۛۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ᩹᩻;->᩻:Ll/᩵ۛۡ;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 290
    iget-object v0, p0, Ll/ᩳ᩹᩻;->ۜ:Ll/ܶ֡ܿ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ܶ֡ܿ;->֫()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ᩳ᩹᩻;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    .line 291
    iget-object v0, p0, Ll/ᩳ᩹᩻;->ۜ:Ll/ܶ֡ܿ;

    invoke-virtual {v0}, Ll/ܶ֡ܿ;->ܽ()I

    move-result v0

    if-lez v0, :cond_0

    .line 292
    iget-object v0, p0, Ll/ᩳ᩹᩻;->ۜ:Ll/ܶ֡ܿ;

    invoke-virtual {v0}, Ll/ܶ֡ܿ;->ܽ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const v0, 0x7f1207e0

    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void

    :cond_0
    const v0, 0x7f120179

    .line 295
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 301
    iget-object v0, p0, Ll/ᩳ᩹᩻;->᩷:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 265
    new-instance v0, Ll/᩺ۤܿ;

    iget-object v1, p0, Ll/ᩳ᩹᩻;->᩷:Ll/ۗܺ᩷;

    invoke-direct {v0, v1}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const v1, 0x7f120178

    .line 266
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->ܽ(I)V

    const-string v1, "..."

    .line 267
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 65
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    .line 269
    invoke-virtual {v0}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    iput-object v0, p0, Ll/ᩳ᩹᩻;->ܳ:Ll/᩺ۤܿ;

    return-void
.end method

.method public final ܿ()V
    .locals 5

    .line 274
    iget-object v0, p0, Ll/ᩳ᩹᩻;->ܳ:Ll/᩺ۤܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/ۧ᩹᩻;

    invoke-direct {v1, v0}, Ll/ۧ᩹᩻;-><init>(Ll/᩺ۤܿ;)V

    new-instance v0, Ll/ܽ᩹᩻;

    invoke-direct {v0, p0}, Ll/ܽ᩹᩻;-><init>(Ll/ᩳ᩹᩻;)V

    iget-wide v2, p0, Ll/ᩳ᩹᩻;->ۡ:J

    iget-boolean v4, p0, Ll/ᩳ᩹᩻;->ۢ:Z

    invoke-static {v2, v3, v4, v1, v0}, Ll/᩹֡ܿ;->֫(JZLl/ܿۖ᩷;Ll/۠֡ܿ;)Ll/ܶ֡ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ᩹᩻;->ۜ:Ll/ܶ֡ܿ;

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 306
    iget-object v0, p0, Ll/ᩳ᩹᩻;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    .line 307
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method
