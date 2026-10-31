.class public final synthetic Ll/۠ܳᩳ;
.super Ljava/lang/Object;
.source "4B3Z"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩸ܳᩳ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/᩸ܳᩳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ܳᩳ;->᩸:Ll/᩸ܳᩳ;

    iput p2, p0, Ll/۠ܳᩳ;->᩹:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/۠ܳᩳ;->᩹:I

    .line 145
    iget-object v1, p0, Ll/۠ܳᩳ;->᩸:Ll/᩸ܳᩳ;

    iget-object v1, v1, Ll/᩸ܳᩳ;->᩸:Ll/ۙܳᩳ;

    invoke-interface {v1, v0}, Ll/ۙܳᩳ;->֫(I)V

    return-void
.end method
