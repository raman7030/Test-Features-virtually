.class public final Ll/᩷ۤ֫;
.super Ljava/lang/Object;
.source "68UW"


# instance fields
.field public ֫:Ll/ᩳ۫֫;

.field public ۧ:Ll/ۧۤ֫;

.field public ܳ:Z

.field public ܽ:Ll/ۡۤ֫;

.field public ܿ:Ll/᩸ۤ֫;

.field public ᩳ:Ll/ܶۤ֫;

.field public final ᩻:Landroid/content/ContextWrapper;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 0

    .line 326
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 327
    iput-object p1, p0, Ll/᩷ۤ֫;->᩻:Landroid/content/ContextWrapper;

    .line 328
    sget-object p1, Ll/ᩳ۫֫;->ᩳ:Ll/ᩳ۫֫;

    iput-object p1, p0, Ll/᩷ۤ֫;->֫:Ll/ᩳ۫֫;

    .line 329
    sget-object p1, Ll/᩻ۤ֫;->֫:Ll/ܶۤ֫;

    iput-object p1, p0, Ll/᩷ۤ֫;->ᩳ:Ll/ܶۤ֫;

    .line 330
    sget-object p1, Ll/ۜۤ֫;->֫:Ll/᩸ۤ֫;

    iput-object p1, p0, Ll/᩷ۤ֫;->ܿ:Ll/᩸ۤ֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷ۤ֫;)Ll/ᩳ۫֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ۤ֫;->֫:Ll/ᩳ۫֫;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩷ۤ֫;)Ll/ܳۤ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ۤ֫;->ۧ:Ll/ۧۤ֫;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/᩷ۤ֫;)Landroid/content/Context;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ۤ֫;->᩻:Landroid/content/ContextWrapper;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩷ۤ֫;)Ll/ۚ֡֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ۤ֫;->ܽ:Ll/ۡۤ֫;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/᩷ۤ֫;)Ll/᩸ۤ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ۤ֫;->ܿ:Ll/᩸ۤ֫;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩷ۤ֫;)Ll/ܶۤ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ۤ֫;->ᩳ:Ll/ܶۤ֫;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/۠ۤ֫;
    .locals 2

    .line 471
    iget-boolean v0, p0, Ll/᩷ۤ֫;->ܳ:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 472
    iput-boolean v1, p0, Ll/᩷ۤ֫;->ܳ:Z

    .line 473
    iget-object v0, p0, Ll/᩷ۤ֫;->ܽ:Ll/ۡۤ֫;

    if-nez v0, :cond_0

    .line 474
    new-instance v0, Ll/ۡۤ֫;

    const/4 v1, 0x0

    new-array v1, v1, [Ll/֡֡֫;

    invoke-direct {v0, v1}, Ll/ۡۤ֫;-><init>([Ll/֡֡֫;)V

    iput-object v0, p0, Ll/᩷ۤ֫;->ܽ:Ll/ۡۤ֫;

    .line 476
    :cond_0
    iget-object v0, p0, Ll/᩷ۤ֫;->ۧ:Ll/ۧۤ֫;

    if-nez v0, :cond_1

    .line 477
    new-instance v0, Ll/ۧۤ֫;

    iget-object v1, p0, Ll/᩷ۤ֫;->᩻:Landroid/content/ContextWrapper;

    invoke-direct {v0, v1}, Ll/ۧۤ֫;-><init>(Landroid/content/ContextWrapper;)V

    iput-object v0, p0, Ll/᩷ۤ֫;->ۧ:Ll/ۧۤ֫;

    .line 479
    :cond_1
    new-instance v0, Ll/۠ۤ֫;

    invoke-direct {v0, p0}, Ll/۠ۤ֫;-><init>(Ll/᩷ۤ֫;)V

    return-object v0
.end method

.method public final ֫([Ll/֡֡֫;)V
    .locals 1

    .line 357
    new-instance v0, Ll/ۡۤ֫;

    invoke-direct {v0, p1}, Ll/ۡۤ֫;-><init>([Ll/֡֡֫;)V

    .line 371
    iput-object v0, p0, Ll/᩷ۤ֫;->ܽ:Ll/ۡۤ֫;

    return-void
.end method
