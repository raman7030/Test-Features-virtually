.class public final Ll/᩶֨᩻;
.super Ljava/lang/Object;
.source "673L"

# interfaces
.implements Ll/ᩳ᩷ܳ;


# instance fields
.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/᩺֨᩻;

.field public final synthetic ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILl/᩺֨᩻;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶֨᩻;->᩶:Ljava/lang/String;

    iput-object p2, p0, Ll/᩶֨᩻;->ۙ:Ljava/lang/String;

    iput p3, p0, Ll/᩶֨᩻;->᩹:I

    iput-object p4, p0, Ll/᩶֨᩻;->᩸:Ll/᩺֨᩻;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 50
    iget-object v0, p0, Ll/᩶֨᩻;->᩸:Ll/᩺֨᩻;

    invoke-virtual {v0}, Ll/᩺֨᩻;->֫()V

    return-void
.end method

.method public final ۧ(I)Ll/ܽ᩷ܳ;
    .locals 7

    .line 43
    new-instance v6, Ll/᩹֨᩻;

    iget v4, p0, Ll/᩶֨᩻;->᩹:I

    iget-object v5, p0, Ll/᩶֨᩻;->᩸:Ll/᩺֨᩻;

    iget-object v2, p0, Ll/᩶֨᩻;->᩶:Ljava/lang/String;

    iget-object v3, p0, Ll/᩶֨᩻;->ۙ:Ljava/lang/String;

    move-object v0, v6

    move v1, p1

    invoke-direct/range {v0 .. v5}, Ll/᩹֨᩻;-><init>(ILjava/lang/String;Ljava/lang/String;ILl/᩺֨᩻;)V

    return-object v6
.end method
