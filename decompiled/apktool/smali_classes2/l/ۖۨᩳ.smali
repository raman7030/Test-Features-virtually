.class public final synthetic Ll/ۖۨᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Throwable;

.field public final synthetic ᩸:Ll/ۘۨᩳ;

.field public final synthetic ᩹:Ll/ۗۤᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۘۨᩳ;Ll/ۗۤᩳ;Ljava/lang/Throwable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۨᩳ;->᩸:Ll/ۘۨᩳ;

    iput-object p2, p0, Ll/ۖۨᩳ;->᩹:Ll/ۗۤᩳ;

    iput-object p3, p0, Ll/ۖۨᩳ;->᩶:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ۖۨᩳ;->᩹:Ll/ۗۤᩳ;

    .line 4
    iget-object v1, p0, Ll/ۖۨᩳ;->᩶:Ljava/lang/Throwable;

    .line 3575
    iget-object v2, p0, Ll/ۖۨᩳ;->᩸:Ll/ۘۨᩳ;

    invoke-virtual {v2, v0, v1}, Ll/ۘۨᩳ;->֫(Ll/ۗۤᩳ;Ljava/lang/Throwable;)V

    return-void
.end method
