.class public final Ll/ۢۤ;
.super Ljava/lang/Object;
.source "DB1R"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۬ۤ;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/۬ۤ;Ljava/lang/Object;)V
    .locals 0

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۤ;->᩸:Ll/۬ۤ;

    iput-object p2, p0, Ll/ۢۤ;->᩹:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 154
    iget-object v0, p0, Ll/ۢۤ;->᩸:Ll/۬ۤ;

    iget-object v1, p0, Ll/ۢۤ;->᩹:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    return-void
.end method
