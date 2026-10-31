.class public final Ll/ۢ۬ۡ;
.super Ljava/lang/Object;
.source "S1VE"

# interfaces
.implements Ll/ۡ۬ۡ;


# instance fields
.field public final ֫:Ll/ۡ۬ۡ;

.field public final ۧ:Z

.field public final ܽ:Z

.field public final ܿ:Z

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(ZZZZLl/ۡ۬ۡ;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-boolean p1, p0, Ll/ۢ۬ۡ;->ܿ:Z

    .line 36
    iput-boolean p2, p0, Ll/ۢ۬ۡ;->ᩳ:Z

    .line 37
    iput-boolean p3, p0, Ll/ۢ۬ۡ;->ۧ:Z

    .line 38
    iput-boolean p4, p0, Ll/ۢ۬ۡ;->ܽ:Z

    .line 40
    iput-object p5, p0, Ll/ۢ۬ۡ;->֫:Ll/ۡ۬ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۗۡ;)V
    .locals 6

    .line 47
    iget-boolean v4, p0, Ll/ۢ۬ۡ;->ܽ:Z

    iget-object v5, p0, Ll/ۢ۬ۡ;->֫:Ll/ۡ۬ۡ;

    iget-boolean v1, p0, Ll/ۢ۬ۡ;->ܿ:Z

    iget-boolean v2, p0, Ll/ۢ۬ۡ;->ᩳ:Z

    iget-boolean v3, p0, Ll/ۢ۬ۡ;->ۧ:Z

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Ll/᩶ۗۡ;->֫(ZZZZLl/ۡ۬ۡ;)V

    return-void
.end method
