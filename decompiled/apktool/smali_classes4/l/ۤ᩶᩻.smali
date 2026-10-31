.class public final synthetic Ll/ۤ᩶᩻;
.super Ljava/lang/Object;
.source "JAK2"

# interfaces
.implements Ll/۬ۗܳ;


# instance fields
.field public final synthetic ۙ:Z

.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ll/ۛ᩶᩻;

.field public final synthetic ᩹:Ll/ܳۙ᩻;


# direct methods
.method public synthetic constructor <init>(Ll/ۛ᩶᩻;Ll/ܳۙ᩻;JZ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ᩶᩻;->᩸:Ll/ۛ᩶᩻;

    iput-object p2, p0, Ll/ۤ᩶᩻;->᩹:Ll/ܳۙ᩻;

    iput-wide p3, p0, Ll/ۤ᩶᩻;->᩶:J

    iput-boolean p5, p0, Ll/ۤ᩶᩻;->ۙ:Z

    return-void
.end method


# virtual methods
.method public final synthetic onCanceled()V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۨۧᩳ;Z)V
    .locals 7

    .line 2
    iget-boolean v4, p0, Ll/ۤ᩶᩻;->ۙ:Z

    .line 123
    iget-object v0, p0, Ll/ۤ᩶᩻;->᩸:Ll/ۛ᩶᩻;

    iget-object v0, v0, Ll/ۛ᩶᩻;->۟:Ll/֫ۙ᩻;

    iget-object v1, p0, Ll/ۤ᩶᩻;->᩹:Ll/ܳۙ᩻;

    iget-wide v2, p0, Ll/ۤ᩶᩻;->᩶:J

    move-object v5, p1

    move v6, p2

    invoke-static/range {v0 .. v6}, Ll/֫ۙ᩻;->֫(Ll/֫ۙ᩻;Ll/ܳۙ᩻;JZLl/ۨۧᩳ;Z)V

    return-void
.end method

.method public final synthetic ֫(Ljava/lang/Exception;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
