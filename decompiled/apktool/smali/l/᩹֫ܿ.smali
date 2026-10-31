.class public final synthetic Ll/᩹֫ܿ;
.super Ljava/lang/Object;
.source "76QP"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/ۙ֫ܿ;

.field public final synthetic ᩹:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ll/ۙ֫ܿ;Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹֫ܿ;->᩸:Ll/ۙ֫ܿ;

    iput-object p2, p0, Ll/᩹֫ܿ;->᩹:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/᩹֫ܿ;->᩸:Ll/ۙ֫ܿ;

    .line 4
    iget-object v1, p0, Ll/᩹֫ܿ;->᩹:Ljava/lang/Runnable;

    .line 98
    invoke-virtual {v0, v1}, Ll/ۤ᩸ᩳ;->ۧ(Ljava/lang/Runnable;)V

    .line 0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method
