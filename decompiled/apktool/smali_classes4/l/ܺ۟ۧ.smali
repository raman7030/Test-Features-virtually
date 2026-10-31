.class public final Ll/ܺ۟ۧ;
.super Ljava/lang/Object;
.source "F1OQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩸:I

.field public final ᩹:Ll/۬۬ۧ;


# direct methods
.method public constructor <init>(Ll/۬۬ۧ;I)V
    .locals 0

    .line 1077
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1078
    iput p2, p0, Ll/ܺ۟ۧ;->᩸:I

    .line 1079
    iput-object p1, p0, Ll/ܺ۟ۧ;->᩹:Ll/۬۬ۧ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1084
    iget-object v0, p0, Ll/ܺ۟ۧ;->᩹:Ll/۬۬ۧ;

    iget v1, p0, Ll/ܺ۟ۧ;->᩸:I

    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->smoothScrollToPosition(I)V

    return-void
.end method
