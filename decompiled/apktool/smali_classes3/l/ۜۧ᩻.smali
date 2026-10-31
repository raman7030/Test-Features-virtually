.class public final synthetic Ll/ۜۧ᩻;
.super Ljava/lang/Object;
.source "I23M"

# interfaces
.implements Ll/ۙ۫ۡ;


# instance fields
.field public final synthetic ᩸:Ll/ܶ᩵ܿ;

.field public final synthetic ᩹:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩵ܿ;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۧ᩻;->᩸:Ll/ܶ᩵ܿ;

    iput-object p2, p0, Ll/ۜۧ᩻;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/graphics/Bitmap;
    .locals 2

    .line 444
    iget-object v0, p0, Ll/ۜۧ᩻;->᩸:Ll/ܶ᩵ܿ;

    invoke-static {v0}, Ll/ܿܺۡ;->ܽ(Ll/ܶ᩵ܿ;)Ll/ۢ᩸ۜ;

    move-result-object v0

    .line 445
    iget-object v1, p0, Ll/ۜۧ᩻;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 446
    invoke-virtual {v0}, Ll/ۢ᩸ۜ;->֫()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
