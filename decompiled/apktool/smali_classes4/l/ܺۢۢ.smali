.class public final Ll/ܺۢۢ;
.super Ljava/lang/Object;
.source "K1PX"


# static fields
.field public static final ᩻:Ll/֡᩻;


# instance fields
.field public ֫:Z

.field public final ۧ:Ll/ܶ᩵ܿ;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ll/֡᩻;

.field public final ܿ:Z

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 335
    new-instance v0, Ll/֡᩻;

    sget-object v1, Ll/᩶ۖܳ;->֨:Ll/᩶ۖܳ;

    .line 248
    iget-object v1, v1, Ll/᩶ۖܳ;->ᩳ:Ll/ۨܺ᩷;

    .line 335
    invoke-virtual {v1}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֡᩻;-><init>(Landroid/graphics/drawable/Drawable;)V

    sput-object v0, Ll/ܺۢۢ;->᩻:Ll/֡᩻;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 343
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 344
    iput-object v0, p0, Ll/ܺۢۢ;->ۧ:Ll/ܶ᩵ܿ;

    const-string v1, ".."

    .line 345
    iput-object v1, p0, Ll/ܺۢۢ;->ܳ:Ljava/lang/String;

    const/4 v1, 0x1

    .line 346
    iput-boolean v1, p0, Ll/ܺۢۢ;->ܿ:Z

    .line 347
    iput-object v0, p0, Ll/ܺۢۢ;->ᩳ:Ljava/lang/String;

    .line 348
    sget-object v0, Ll/ܺۢۢ;->᩻:Ll/֡᩻;

    iput-object v0, p0, Ll/ܺۢۢ;->ܽ:Ll/֡᩻;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܺۢۢ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 4

    .line 351
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 352
    iput-object p1, p0, Ll/ܺۢۢ;->ۧ:Ll/ܶ᩵ܿ;

    .line 353
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۢۢ;->ܳ:Ljava/lang/String;

    .line 354
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    iput-boolean v0, p0, Ll/ܺۢۢ;->ܿ:Z

    .line 355
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 356
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/ܿۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_0

    const-string v2, "  "

    .line 358
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܺۢۢ;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 362
    sget-object p1, Ll/ܺۢۢ;->᩻:Ll/֡᩻;

    iput-object p1, p0, Ll/ܺۢۢ;->ܽ:Ll/֡᩻;

    return-void

    .line 364
    :cond_1
    new-instance p1, Ll/֡᩻;

    sget-object v0, Ll/᩶ۖܳ;->ۜ:Ll/᩶ۖܳ;

    .line 248
    iget-object v0, v0, Ll/᩶ۖܳ;->ᩳ:Ll/ۨܺ᩷;

    .line 364
    invoke-virtual {v0}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/֡᩻;-><init>(Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Ll/ܺۢۢ;->ܽ:Ll/֡᩻;

    return-void
.end method
