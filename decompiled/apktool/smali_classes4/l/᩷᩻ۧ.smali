.class public final Ll/᩷᩻ۧ;
.super Ljava/lang/Object;
.source "Q8Q4"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/ܽۚ֫;

.field public ܳ:Ll/ܳ֡֫;

.field public final ܽ:Landroid/content/Context;

.field public final ܿ:Ll/ۙ᩻ۧ;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/ۙ᩻ۧ;)V
    .locals 0

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩻ۧ;->ܽ:Landroid/content/Context;

    .line 123
    iput-object p2, p0, Ll/᩷᩻ۧ;->ܿ:Ll/ۙ᩻ۧ;

    .line 124
    sget-object p1, Ll/ܽۚ֫;->֫:Ll/ܳ֨֫;

    iput-object p1, p0, Ll/᩷᩻ۧ;->ۧ:Ll/ܽۚ֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷᩻ۧ;)Ll/ܽۚ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩻ۧ;->ۧ:Ll/ܽۚ֫;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩷᩻ۧ;)Landroid/content/Context;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩻ۧ;->ܽ:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩷᩻ۧ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩷᩻ۧ;->ᩳ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/᩷᩻ۧ;)Ll/ܳ֡֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩻ۧ;->ܳ:Ll/ܳ֡֫;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩷᩻ۧ;)Ll/ۙ᩻ۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷᩻ۧ;->ܿ:Ll/ۙ᩻ۧ;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/֨᩻ۧ;
    .locals 2

    .line 208
    iget-boolean v0, p0, Ll/᩷᩻ۧ;->֫:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 210
    iget-object v0, p0, Ll/᩷᩻ۧ;->ܳ:Ll/ܳ֡֫;

    if-nez v0, :cond_0

    .line 211
    new-instance v0, Ll/֡᩻ۧ;

    invoke-direct {v0}, Ll/֡᩻ۧ;-><init>()V

    iput-object v0, p0, Ll/᩷᩻ۧ;->ܳ:Ll/ܳ֡֫;

    .line 213
    :cond_0
    new-instance v0, Ll/֨᩻ۧ;

    invoke-direct {v0, p0}, Ll/֨᩻ۧ;-><init>(Ll/᩷᩻ۧ;)V

    .line 214
    iput-boolean v1, p0, Ll/᩷᩻ۧ;->֫:Z

    return-object v0
.end method

.method public final ֫(Ll/ܽۚ֫;)V
    .locals 0

    .line 182
    iput-object p1, p0, Ll/᩷᩻ۧ;->ۧ:Ll/ܽۚ֫;

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 168
    iput-boolean v0, p0, Ll/᩷᩻ۧ;->ᩳ:Z

    return-void
.end method
