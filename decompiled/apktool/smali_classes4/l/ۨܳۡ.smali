.class public final Ll/ۨܳۡ;
.super Ll/ۢ۬ۧ;
.source "H1KB"


# instance fields
.field public ֫:Ljava/lang/String;

.field public final synthetic ۧ:Ll/ܰܳۡ;

.field public final synthetic ܽ:Ll/֨ܳۢ;


# direct methods
.method public constructor <init>(Ll/ܰܳۡ;Ll/֨ܳۢ;)V
    .locals 0

    .line 1084
    iput-object p1, p0, Ll/ۨܳۡ;->ۧ:Ll/ܰܳۡ;

    iput-object p2, p0, Ll/ۨܳۡ;->ܽ:Ll/֨ܳۢ;

    invoke-direct {p0}, Ll/ۢ۬ۧ;-><init>()V

    const-string p1, "//"

    .line 1085
    iput-object p1, p0, Ll/ۨܳۡ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onScrolled(Ll/۬۬ۧ;II)V
    .locals 0

    .line 1089
    iget-object p1, p0, Ll/ۨܳۡ;->ۧ:Ll/ܰܳۡ;

    invoke-virtual {p1}, Ll/ܰܳۡ;->ܺ()Ljava/lang/String;

    move-result-object p1

    .line 1090
    iget-object p2, p0, Ll/ۨܳۡ;->֫:Ljava/lang/String;

    invoke-static {p2, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 1091
    iput-object p1, p0, Ll/ۨܳۡ;->֫:Ljava/lang/String;

    .line 1092
    iget-object p2, p0, Ll/ۨܳۡ;->ܽ:Ll/֨ܳۢ;

    invoke-virtual {p2, p1}, Ll/֨ܳۢ;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
