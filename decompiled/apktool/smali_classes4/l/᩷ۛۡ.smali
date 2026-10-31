.class public final synthetic Ll/᩷ۛۡ;
.super Ljava/lang/Object;
.source "91U1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۖۛۡ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(ILl/ۖۛۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/᩷ۛۡ;->᩸:Ll/ۖۛۡ;

    iput p1, p0, Ll/᩷ۛۡ;->᩹:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/᩷ۛۡ;->᩸:Ll/ۖۛۡ;

    .line 4
    iget v1, p0, Ll/᩷ۛۡ;->᩹:I

    .line 31
    invoke-interface {v0, v1}, Ll/ۖۛۡ;->֫(I)V

    return-void
.end method
