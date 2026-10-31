.class public final Ll/ܶ᩹ᩳ;
.super Ljava/lang/Object;
.source "26UL"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩸:Ll/᩵۬ᩳ;

.field public final ᩹:Ll/ۧ۫ᩳ;


# direct methods
.method public constructor <init>(Ll/ۧ۫ᩳ;Ll/᩵۬ᩳ;)V
    .locals 0

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    iput-object p2, p0, Ll/ܶ᩹ᩳ;->᩸:Ll/᩵۬ᩳ;

    if-nez p2, :cond_0

    goto :goto_0

    .line 133
    :cond_0
    invoke-virtual {p2}, Ll/᩵۬ᩳ;->֫()Ll/ۧ۫ᩳ;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/ܶ᩹ᩳ;->᩹:Ll/ۧ۫ᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ܶ᩹ᩳ;->᩸:Ll/᩵۬ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩵۬ᩳ;->close()V

    :cond_0
    return-void
.end method
