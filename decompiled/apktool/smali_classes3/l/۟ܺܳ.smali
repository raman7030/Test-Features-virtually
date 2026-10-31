.class public final synthetic Ll/۟ܺܳ;
.super Ljava/lang/Object;
.source "R12P"

# interfaces
.implements Ll/֫ۛ;


# instance fields
.field public final synthetic ֫:Ll/᩸ۖܳ;

.field public final synthetic ۧ:Ll/᩹ۖܳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩸ۖܳ;Ll/᩹ۖܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ܺܳ;->֫:Ll/᩸ۖܳ;

    iput-object p2, p0, Ll/۟ܺܳ;->ۧ:Ll/᩹ۖܳ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/۟ܺܳ;->ۧ:Ll/᩹ۖܳ;

    .line 238
    iget v0, v0, Ll/᩹ۖܳ;->᩶:I

    iget-object v1, p0, Ll/۟ܺܳ;->֫:Ll/᩸ۖܳ;

    invoke-static {v1, v0}, Ll/ۛۢۡ;->֫(Ll/᩸ۖܳ;I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
