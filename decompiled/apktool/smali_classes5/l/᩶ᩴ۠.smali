.class public final Ll/᩶ᩴ۠;
.super Ll/ۗ᩹۠;
.source "Y43E"


# instance fields
.field public final synthetic ֫:Ll/ۗᩴ۠;


# direct methods
.method public constructor <init>(Ll/ۗᩴ۠;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 580
    iput-object p1, p0, Ll/᩶ᩴ۠;->֫:Ll/ۗᩴ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۖܶ۠;)Ljava/lang/Boolean;
    .locals 2

    .line 218
    invoke-virtual {p1}, Ll/ۖܶ۠;->ۧ()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 584
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 586
    :cond_0
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤ᩸۠;

    .line 587
    iget-object v1, p0, Ll/᩶ᩴ۠;->֫:Ll/ۗᩴ۠;

    invoke-static {v1}, Ll/ۗᩴ۠;->֫(Ll/ۗᩴ۠;)V

    .line 588
    iget-object v1, v1, Ll/ۗᩴ۠;->ܽ:Ljava/io/PrintWriter;

    invoke-interface {v0}, Ll/ۤ᩸۠;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto :goto_0

    .line 590
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method
