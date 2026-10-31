.class public final synthetic Ll/ܰۧܿ;
.super Ljava/lang/Object;
.source "35OM"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۧܽܿ;

.field public final synthetic ᩹:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Ll/ۧܽܿ;Ljava/lang/Throwable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۧܿ;->᩸:Ll/ۧܽܿ;

    iput-object p2, p0, Ll/ܰۧܿ;->᩹:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ܰۧܿ;->᩸:Ll/ۧܽܿ;

    iget-object v1, p0, Ll/ܰۧܿ;->᩹:Ljava/lang/Throwable;

    invoke-static {v0, v1}, Ll/ۧܽܿ;->֫(Ll/ۧܽܿ;Ljava/lang/Throwable;)V

    return-void
.end method
