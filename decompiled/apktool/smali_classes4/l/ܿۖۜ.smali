.class public final synthetic Ll/ܿۖۜ;
.super Ljava/lang/Object;
.source "D6X3"

# interfaces
.implements Ll/ܶۚ֫;
.implements Ll/ܽۖۜ;
.implements Ll/᩺᩻᩻;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܿۖۜ;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/ܿۖۜ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(J)Ljava/io/InputStream;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ܿۖۜ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۗۢ᩻;

    .line 6
    iget-object v1, p0, Ll/ܿۖۜ;->᩹:Ljava/lang/Object;

    .line 8
    check-cast v1, Ll/ᩳۜܳ;

    .line 1043
    invoke-interface {v1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Ll/ۗۢ᩻;->֫(JLjava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ܿۖۜ;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ܿۖۜ;->᩹:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1, p1, p2, p3}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ljava/lang/Object;Ll/ۚᩴ֫;)V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ܿۖۜ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/᩶۬֫;

    iget-object v1, p0, Ll/ܿۖۜ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/֨᩵֫;

    check-cast p1, Ll/֨۬֫;

    invoke-static {v0, v1, p1, p2}, Ll/᩶۬֫;->֫(Ll/᩶۬֫;Ll/֨᩵֫;Ll/֨۬֫;Ll/ۚᩴ֫;)V

    return-void
.end method
