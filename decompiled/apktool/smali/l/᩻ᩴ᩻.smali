.class public final synthetic Ll/᩻ᩴ᩻;
.super Ljava/lang/Object;
.source "R80D"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Ll/۬ۤ;


# direct methods
.method public synthetic constructor <init>(Ll/۬ۤ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ᩴ᩻;->֫:Ll/۬ۤ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Ll/ۧۢ᩻;

    .line 25
    new-instance v0, Ll/ۜᩴ᩻;

    invoke-direct {v0, p1}, Ll/ۜᩴ᩻;-><init>(Ll/ۧۢ᩻;)V

    iget-object p1, p0, Ll/᩻ᩴ᩻;->֫:Ll/۬ۤ;

    invoke-interface {p1, v0}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    return-void
.end method
