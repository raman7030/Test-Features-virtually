.class public final synthetic Ll/ۤᩳܳ;
.super Ljava/lang/Object;
.source "R6KO"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:[Z

.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ᩶:Ll/ᩴܿܳ;

.field public final synthetic ᩸:Z

.field public final synthetic ᩹:Ll/֨ܿܳ;


# direct methods
.method public synthetic constructor <init>(ZLl/֨ܿܳ;Ll/ᩴܿܳ;Ljava/lang/String;[Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/ۤᩳܳ;->᩸:Z

    iput-object p2, p0, Ll/ۤᩳܳ;->᩹:Ll/֨ܿܳ;

    iput-object p3, p0, Ll/ۤᩳܳ;->᩶:Ll/ᩴܿܳ;

    iput-object p4, p0, Ll/ۤᩳܳ;->ۙ:Ljava/lang/String;

    iput-object p5, p0, Ll/ۤᩳܳ;->ۗ:[Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 76
    iget-boolean v0, p0, Ll/ۤᩳܳ;->᩸:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iget-object v1, p0, Ll/ۤᩳܳ;->ۗ:[Z

    aget-boolean v0, v1, v0

    iget-object v1, p0, Ll/ۤᩳܳ;->᩹:Ll/֨ܿܳ;

    iget-object v2, p0, Ll/ۤᩳܳ;->᩶:Ll/ᩴܿܳ;

    iget-object v3, p0, Ll/ۤᩳܳ;->ۙ:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v0}, Ll/֨ܿܳ;->֫(Ll/ᩴܿܳ;Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method
