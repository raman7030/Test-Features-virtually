.class public final synthetic Ll/֡ۨܿ;
.super Ljava/lang/Object;
.source "PAKQ"

# interfaces
.implements Ll/֨ۢۡ;


# instance fields
.field public final synthetic ֫:Ll/ۗۨܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗۨܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۨܿ;->֫:Ll/ۗۨܿ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 2
    sget v0, Ll/ۗۨܿ;->ܳ֫:I

    .line 259
    new-instance v0, Ll/᩹ۨܿ;

    iget-object v1, p0, Ll/֡ۨܿ;->֫:Ll/ۗۨܿ;

    invoke-direct {v0, v1}, Ll/᩹ۨܿ;-><init>(Ll/ۗۨܿ;)V

    const-wide/16 v1, 0xa

    invoke-static {v0, v1, v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void
.end method
