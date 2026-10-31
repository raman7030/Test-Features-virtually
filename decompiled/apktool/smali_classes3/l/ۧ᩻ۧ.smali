.class public final Ll/ۧ᩻ۧ;
.super Ljava/lang/Object;
.source "Z8VY"


# instance fields
.field public ֫:J

.field public ۧ:Z

.field public ܳ:Ll/ܽۜۧ;

.field public ܽ:Ll/ܰܰ֫;

.field public ܿ:Landroid/os/Handler;

.field public final ᩳ:Landroid/content/ContextWrapper;

.field public ᩻:I


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 1

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 250
    iput-object p1, p0, Ll/ۧ᩻ۧ;->ᩳ:Landroid/content/ContextWrapper;

    .line 141
    new-instance v0, Ll/۫ܰ֫;

    invoke-direct {v0, p1}, Ll/۫ܰ֫;-><init>(Landroid/content/ContextWrapper;)V

    .line 252
    iput-object v0, p0, Ll/ۧ᩻ۧ;->ܽ:Ll/ܰܰ֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۧ᩻ۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۧ᩻ۧ;->֫:J

    return-wide v0
.end method

.method public static bridge synthetic ۧ(Ll/ۧ᩻ۧ;)Ll/ܰܰ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧ᩻ۧ;->ܽ:Ll/ܰܰ֫;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۧ᩻ۧ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۧ᩻ۧ;->᩻:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ۧ᩻ۧ;)Landroid/content/Context;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧ᩻ۧ;->ᩳ:Landroid/content/ContextWrapper;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۧ᩻ۧ;)Ll/ܽۜۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧ᩻ۧ;->ܳ:Ll/ܽۜۧ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۧ᩻ۧ;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧ᩻ۧ;->ܿ:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ܿ᩻ۧ;
    .locals 3

    .line 411
    iget-boolean v0, p0, Ll/ۧ᩻ۧ;->ۧ:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 412
    iget-object v0, p0, Ll/ۧ᩻ۧ;->ܿ:Landroid/os/Handler;

    if-nez v0, :cond_0

    iget-object v2, p0, Ll/ۧ᩻ۧ;->ܳ:Ll/ܽۜۧ;

    if-eqz v2, :cond_1

    :cond_0
    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۧ᩻ۧ;->ܳ:Ll/ܽۜۧ;

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 415
    iput-boolean v1, p0, Ll/ۧ᩻ۧ;->ۧ:Z

    .line 416
    new-instance v0, Ll/ܿ᩻ۧ;

    invoke-direct {v0, p0}, Ll/ܿ᩻ۧ;-><init>(Ll/ۧ᩻ۧ;)V

    return-object v0
.end method

.method public final ֫(Landroid/os/Handler;)V
    .locals 0

    .line 302
    iput-object p1, p0, Ll/ۧ᩻ۧ;->ܿ:Landroid/os/Handler;

    return-void
.end method

.method public final ֫(Ll/ܰܰ֫;)V
    .locals 0

    .line 270
    iput-object p1, p0, Ll/ۧ᩻ۧ;->ܽ:Ll/ܰܰ֫;

    return-void
.end method

.method public final ֫(Ll/ܽۜۧ;)V
    .locals 0

    .line 314
    iput-object p1, p0, Ll/ۧ᩻ۧ;->ܳ:Ll/ܽۜۧ;

    return-void
.end method

.method public final ۧ()V
    .locals 2

    const-wide/16 v0, 0x1388

    .line 280
    iput-wide v0, p0, Ll/ۧ᩻ۧ;->֫:J

    return-void
.end method

.method public final ܽ()V
    .locals 1

    const/16 v0, 0x32

    .line 324
    iput v0, p0, Ll/ۧ᩻ۧ;->᩻:I

    return-void
.end method
