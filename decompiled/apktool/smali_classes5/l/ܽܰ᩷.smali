.class public Ll/ܽܰ᩷;
.super Ll/ܳۛ᩷;
.source "B1E0"


# instance fields
.field public ۗ:Ll/ۡۤۡ;

.field public ۙ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const v0, 0x7f0d004a

    .line 20
    invoke-direct {p0, v0}, Ll/ܳۛ᩷;-><init>(I)V

    .line 16
    invoke-static {}, Ll/ۡۤۡ;->ܿ()Ll/ۡۤۡ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽܰ᩷;->ۗ:Ll/ۡۤۡ;

    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Ll/ܽܰ᩷;->ۙ:Z

    const-string v0, "000000-0000-0000-0000-000000000002"

    .line 21
    invoke-virtual {p0, v0}, Ll/ܳۛ᩷;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܽܰ᩷;)V
    .locals 2

    .line 31
    iget-object v0, p0, Ll/ܽܰ᩷;->ۗ:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    new-instance v0, Ll/᩻۠᩷;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/᩻۠᩷;-><init>(I)V

    invoke-virtual {p0, v0}, Ll/ܳۛ᩷;->֫(Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ܽܰ᩷;Ll/ܿۛ᩷;)V
    .locals 1

    .line 83
    iget-boolean v0, p0, Ll/ܽܰ᩷;->ۙ:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ܿۛ᩷;->۟()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 84
    iput-boolean p1, p0, Ll/ܽܰ᩷;->ۙ:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final onResume()V
    .locals 3

    .line 69
    invoke-super {p0}, Ll/ܳۛ᩷;->onResume()V

    .line 70
    new-instance v0, Ll/֫ܰ᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Ll/ܳۛ᩷;->֫(Ljava/util/function/Consumer;)V

    .line 74
    iget-boolean v0, p0, Ll/ܽܰ᩷;->ۙ:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ܽܰ᩷;->ۗ:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 82
    :cond_1
    new-instance v1, Ll/۫ܿ᩷;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/۫ܿ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const p2, 0x7f0a00a2

    .line 30
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance p2, Ll/ۡܰܿ;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p0}, Ll/ۡܰܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final ֡()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ֫([B)V
    .locals 0

    return-void
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()I
    .locals 1

    const v0, 0x7f0802a2

    return v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    const v0, 0x7f1200e9

    .line 44
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    const v0, 0x7f1200e9

    .line 44
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
