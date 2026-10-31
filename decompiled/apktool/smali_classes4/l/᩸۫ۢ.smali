.class public final Ll/᩸۫ۢ;
.super Ljava/lang/Object;
.source "56OY"


# static fields
.field public static final ۧ:Ll/᩸۫ۢ;


# instance fields
.field public final ֫:Ll/ܶ۫ۢ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 7
    new-instance v0, Ll/᩸۫ۢ;

    sget-object v1, Ll/ܶ۫ۢ;->᩹:Ll/ܶ۫ۢ;

    invoke-direct {v0, v1}, Ll/᩸۫ۢ;-><init>(Ll/ܶ۫ۢ;)V

    .line 8
    new-instance v0, Ll/᩸۫ۢ;

    sget-object v1, Ll/ܶ۫ۢ;->᩶:Ll/ܶ۫ۢ;

    invoke-direct {v0, v1}, Ll/᩸۫ۢ;-><init>(Ll/ܶ۫ۢ;)V

    .line 9
    sput-object v0, Ll/᩸۫ۢ;->ۧ:Ll/᩸۫ۢ;

    return-void
.end method

.method public constructor <init>(Ll/ܶ۫ۢ;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 24
    iput-object p1, p0, Ll/᩸۫ۢ;->֫:Ll/ܶ۫ۢ;

    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "whitespacePolicy"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ll/ܶ۫ۢ;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/᩸۫ۢ;->֫:Ll/ܶ۫ۢ;

    return-object v0
.end method
