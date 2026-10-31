.class public final Ll/ۖۨ᩻;
.super Ljava/lang/Object;
.source "879H"


# instance fields
.field public final ֫:I

.field public final ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Lbin/mt/json/JSONObject;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V
    .locals 6

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    .line 1491
    invoke-direct/range {v0 .. v5}, Ll/ۖۨ᩻;-><init>(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;II)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;II)V
    .locals 0

    .line 1497
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1498
    iput-object p1, p0, Ll/ۖۨ᩻;->ܿ:Ljava/lang/String;

    .line 1499
    iput-object p2, p0, Ll/ۖۨ᩻;->ۧ:Lbin/mt/json/JSONObject;

    .line 1500
    iput-object p3, p0, Ll/ۖۨ᩻;->ܽ:Lbin/mt/json/JSONObject;

    .line 1501
    iput p4, p0, Ll/ۖۨ᩻;->ᩳ:I

    .line 1502
    iput p5, p0, Ll/ۖۨ᩻;->֫:I

    return-void
.end method
